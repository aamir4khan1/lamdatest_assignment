# Use an official Maven runtime as a parent image
FROM maven:3.8.6-openjdk-11-slim

# Set the working directory in the container
WORKDIR /usr/src/app

# Copy the Maven project file
COPY . .

# Install dependencies for headless mode
RUN apt-get update && \
    apt-get install -y \
    xvfb \
    curl \
    wget \
    unzip \
    gnupg \
    && rm -rf /var/lib/apt/lists/*

# Add Google Chrome repository and install Chrome
RUN wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - \
    && echo "deb http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google-chrome.list \
    && apt-get update -y \
    && apt-get install -y google-chrome-stable


# Set environment variables for headless mode
ENV DISPLAY=:99

# Start Xvfb in the background
CMD Xvfb :99 -ac & mvn clean test
