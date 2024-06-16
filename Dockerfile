# Use an official Node.js runtime as a parent image
FROM node:14

# Set the working directory in the container
WORKDIR /usr/src/app

# Create a simple index.js file (example)
RUN echo "console.log('Hello, Docker!')" > index.js

# Expose the port on which the app runs (optional)
EXPOSE 3000

# Command to run the application
CMD ["node", "index.js"]
