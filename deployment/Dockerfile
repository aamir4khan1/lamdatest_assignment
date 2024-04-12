# Use an official Maven runtime as a parent image
FROM maven:3.8.6-openjdk-11-slim

# Set the working directory in the container
WORKDIR /usr/src/app

# Copy the Maven project file
COPY pom.xml .

# Copy the rest of the project files
COPY src/ src/

# Build the project
RUN mvn -B -f pom.xml clean package

# Set the command to run your tests
CMD ["mvn", "test"]
