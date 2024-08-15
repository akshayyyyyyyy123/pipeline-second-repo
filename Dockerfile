# Use an official Node.js runtime as a parent image
FROM node:14

# Set the working directory in the container
WORKDIR /usr/src/app

# Create a simple index.js file (example)
RUN echo "console.log('Hello, Docker!')" > akshay_test.js

# Expose the port on which the app runs (optional)
EXPOSE 3002

# Command to run the application
CMD ["node", "akshay_test.js"]
