# Use an official Maven runtime as a parent image
#FROM maven:3.8.6-openjdk-11-slim
agent {label 'codebuild'}
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

# Download and install Chrome
RUN curl -sS -o - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - \
    && echo "deb [arch=amd64]  http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google-chrome.list \
    && apt-get -y update \
    && apt-get -y install google-chrome-stable 

# Set environment variables for headless mode
ENV DISPLAY=:99

# Start Xvfb in the background
CMD Xvfb :99 -ac & mvn clean test
