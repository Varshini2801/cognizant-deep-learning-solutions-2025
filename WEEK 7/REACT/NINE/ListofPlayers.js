import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat Kohli', score: 85 },
    { name: 'Rohit Sharma', score: 95 },
    { name: 'Shubman Gill', score: 45 },
    { name: 'Ravindra Jadeja', score: 67 },
    { name: 'Hardik Pandya', score: 78 },
    { name: 'KL Rahul', score: 56 },
    { name: 'Jasprit Bumrah', score: 60 },
    { name: 'Kuldeep Yadav', score: 72 },
    { name: 'R. Ashwin', score: 40 },
    { name: 'Shreyas Iyer', score: 91 },
    { name: 'Mohammed Siraj', score: 30 },
  ];

  // Filter using arrow function
  const below70 = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players (Using map):</h2>
      <ul>
        {players.map((p, i) => (
          <li key={i}>{p.name} - {p.score}</li>
        ))}
      </ul>

      <h2>Players with score below 70 (Using arrow function):</h2>
      <ul>
        {below70.map((p, i) => (
          <li key={i}>{p.name} - {p.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
