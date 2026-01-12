const express = require("express");
const cors = require("cors");
const axios = require("axios");

const app = express();
app.use(cors());
app.use(express.json());
app.get("/api/health", async (req, res) => {
  try {
    const response = await axios.get("http://localhost:8080/api/health");
    res.json({
      source: "node-middleware",
      backResponse: response.data,
    });
  } catch (error) {
    res.status(500).json({ error: "Failed to fetch health status" });
  }
});

const PORT = 4000;
app.listen(PORT, () => {
  console.log(`Node middleware running on http://localhost:${PORT}`);
});
