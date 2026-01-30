async function checkHealth() {
    const statusDiv = document.getElementById("healthStatus");
    statusDiv.innerText = "Checking backend health...";

    try {
        const response = await fetch("/api/health");
        const data = await response.json();

        statusDiv.innerText =
            `Backend Status: ${data.status} (${data.service})`;
    } catch (error) {
        statusDiv.innerText =
            "Failed to reach backend. Check ingress or service configuration.";
    }
}

async function loadData() {
    const list = document.getElementById("dataList");
    list.innerHTML = "";

    try {
        const response = await fetch("/api/data");
        const items = await response.json();

        items.forEach(item => {
            const li = document.createElement("li");
            li.innerText = `ID: ${item.id}, Name: ${item.name}`;
            list.appendChild(li);
        });

    } catch (error) {
        const li = document.createElement("li");
        li.innerText =
            "Error loading data. Backend or database may be unavailable.";
        list.appendChild(li);
    }
}

