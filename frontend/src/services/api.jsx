export async function fetchHealth() {
  const response = fetch("http://localhost:4000/api/health");

  if (!response.ok) {
    throw new Error("Failed to fetch health status");
  }
  return response.json();
}
