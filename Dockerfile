# Use an official Maven runtime as a parent image
FROM maven:3.8.6-openjdk-11-slim

# Set the working directory in the container
WORKDIR /usr/SpinnyWebAutomation

# Copy the Maven project file
COPY . .

# Install necessary dependencies, including AWS CLI
RUN apt-get update && \
    apt-get install -y \
    curl \
    wget \
    unzip \
    gnupg \
    awscli \
    && rm -rf /var/lib/apt/lists/*


# Define environment variables for the S3 bucket and path
ARG S3_BUCKET
ARG S3_PATH
ARG URL

# Run Maven tests
RUN mvn clean test -DURL=${URL}

# Upload the report to S3 using the provided bucket and path
RUN aws s3 cp /usr/SpinnyWebAutomation/target/cucumber-html-reports s3://${S3_BUCKET}/${S3_PATH} --recursive