# Stage 1: Build the Angular app
FROM node:20.11.0 AS build

WORKDIR /app

COPY package.json package-lock.json ./
RUN npm install -g @angular/cli
RUN npm install

COPY . .

# Expose port 4200
EXPOSE 4200

# Start NGINX
CMD ["ng", "serve", "--host", "0.0.0.0"]
