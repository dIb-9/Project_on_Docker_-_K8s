-- Create application database
CREATE DATABASE IF NOT EXISTS appdb;

-- Use the database
USE appdb;

-- Create table
CREATE TABLE IF NOT EXISTS items (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Insert sample data
INSERT INTO items (name) VALUES
('Docker Basics'),
('Kubernetes Pods'),
('Kubernetes Services'),
('Ingress Routing'),
('Persistent Volumes');

