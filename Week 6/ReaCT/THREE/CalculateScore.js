import React, { useState } from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore() {
  const [name, setName] = useState('');
  const [school, setSchool] = useState('');
  const [total, setTotal] = useState('');
  const [goal, setGoal] = useState('');
  const [average, setAverage] = useState(null);

  const handleSubmit = (e) => {
    e.preventDefault();
    if (!isNaN(total) && total !== '') {
      const avg = (parseFloat(total) / 5).toFixed(2); // Example: 5 subjects
      setAverage(avg);
    } else {
      alert("Please enter a valid total score");
    }
  };

  return (
    <div className="container">
      <h2>Student Score Calculator</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Student Name"
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
        <input
          type="text"
          placeholder="School"
          value={school}
          onChange={(e) => setSchool(e.target.value)}
        />
        <input
          type="number"
          placeholder="Total Marks"
          value={total}
          onChange={(e) => setTotal(e.target.value)}
        />
        <input
          type="text"
          placeholder="Goal"
          value={goal}
          onChange={(e) => setGoal(e.target.value)}
        />
        <button type="submit">Calculate Average</button>
      </form>

      {average && (
        <div className="result">
          <h3>Result:</h3>
          <p><strong>Name:</strong> {name}</p>
          <p><strong>School:</strong> {school}</p>
          <p><strong>Total Marks:</strong> {total}</p>
          <p><strong>Goal:</strong> {goal}</p>
          <p><strong>Average Score:</strong> {average}</p>
        </div>
      )}
    </div>
  );
}

export default CalculateScore;
