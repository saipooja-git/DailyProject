import { useEffect } from "react";
import { useState } from "react";
import { fetchHealth } from "./services/api";

function App() {
  const [health, setHealth] = useState(null);
  const [error, setError] = useState(null);

  useEffect(() => {
    fetchHealth()
      .then((res) => res.json())
      .then((data) => setHealth(data))
      .catch(() => {
        setError("Failed to load health status");
      });
  }, []);
  return (
    <div style={{ padding: "20px" }}>
      <h1>Health Status</h1>
      {error && <p>{error}</p>}
      {health && <pre>{JSON.stringify(health, null, 2)}</pre>}
    </div>
  );
}

export default App;
