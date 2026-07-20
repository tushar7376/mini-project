import { useState } from "react";

function App() {
  const [message, setMessage] = useState("");

  // This is the entire "frontend logic" for this mini project.
  // Clicking the button calls the Spring Boot backend and shows what it returns.
  const fetchMessage = async () => {
    const response = await fetch("https://mini-project-gcq6.onrender.com/api/hello");
    const text = await response.text();
    setMessage(text);
  };

  return (
    <div style={{ fontFamily: "sans-serif", padding: "40px", textAlign: "center" }}>
      <h1>React + Spring Boot mini project</h1>
      <button onClick={fetchMessage} style={{ padding: "10px 20px", fontSize: "16px" }}>
        Call backend
      </button>
      <p style={{ marginTop: "20px", fontSize: "18px" }}>{message}</p>
    </div>
  );
}

export default App;
