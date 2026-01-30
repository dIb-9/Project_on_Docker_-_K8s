# Docker & Kubernetes Practice Project (Minikube)

This repository contains a **hands-on practice project** designed to apply Docker and Kubernetes fundamentals using **Minikube**.  
The focus of this project is **containerization, orchestration, networking, configuration, and persistence**, not application complexity.

The application code is intentionally simple so learners can concentrate on **DevOps concepts**.

---

## Project Goal

Practice deploying and orchestrating a **three-tier application** on Kubernetes while working with:

- Docker image creation (from Dockerfiles)
- Kubernetes Deployments & ReplicaSets
- Services (ClusterIP)
- Ingress (external access)
- ConfigMaps & Secrets
- PersistentVolumes (PV) & PersistentVolumeClaims (PVC)
- Pod-to-pod and service-to-service communication

---

## Application Architecture

The project simulates a basic microservices-style setup:

Browser
|
Ingress
|

| |
Frontend Service Backend Service
| |
Frontend Pods (2) Backend Pods (2)
|
Database Service
|
MySQL Pod (1)
|
PVC / PV


---

## Technology Stack

### Backend
- Java 17
- Spring Boot
- Maven
- MySQL (via JDBC)
- Stateless REST API

### Frontend
- Static HTML + JavaScript
- Served by Nginx
- Communicates with backend via `/api` (Ingress routing)

### Database
- MySQL
- Initialized using SQL script
- Persistent storage via PVC

---

## Repository Structure

.
├── backend/ # Spring Boot (Java + Maven)
├── frontend/ # Static HTML + JS
├── db/ # Database initialization SQL
└── README.md


---

## What Is Provided

- ✅ Backend application source code
- ✅ Frontend static files
- ✅ Database initialization script (`init.sql`)

---

## What Students Are Expected to Do

- Write **Dockerfiles** for:
  - Backend (Maven build → target JAR)
  - Frontend (Nginx)
  - Database (MySQL official image)
- Build Docker images locally (Minikube environment)
- Create Kubernetes manifests for:
  - Deployments
  - Services
  - ConfigMaps
  - Secrets
  - PersistentVolume & PersistentVolumeClaim
  - Ingress
- Deploy and test the application on **Minikube**

---

## Key Learning Outcomes

By completing this project, learners will understand:

- How containers communicate inside a Kubernetes cluster
- The role of Services in service discovery and load balancing
- The difference between NodePort and Ingress
- How to externalize configuration using ConfigMaps and Secrets
- How persistence works with PVs and PVCs
- How stateless and stateful workloads differ
- A realistic Docker → Kubernetes workflow

---

## Scope & Limitations

To keep the project focused and laptop-friendly:

- No Helm
- No CI/CD pipelines
- No TLS or authentication
- No cloud-managed services
- No advanced Kubernetes features (HPA, StatefulSets)

---

## Target Environment

- Minikube
- Local development laptops
- Kubernetes fundamentals level
