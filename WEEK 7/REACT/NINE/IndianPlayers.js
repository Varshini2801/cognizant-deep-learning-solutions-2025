import React from 'react';

const IndianPlayers = () => {
  const oddTeam = ['Virat', 'Hardik', 'Ashwin'];
  const evenTeam = ['Rohit', 'Jadeja', 'Bumrah'];

  // Destructuring
  const [odd1, odd2, odd3] = oddTeam;
  const [even1, even2, even3] = evenTeam;

  const T20players = ['Surya', 'Tilak', 'Samson'];
  const RanjiTrophy = ['Pujara', 'Rahane', 'Jadeja'];

  // Merging Arrays
  const mergedPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Team Players (Destructuring):</h2>
      <ul>
        <li>{odd1}</li>
        <li>{odd2}</li>
        <li>{odd3}</li>
      </ul>

      <h2>Even Team Players (Destructuring):</h2>
      <ul>
        <li>{even1}</li>
        <li>{even2}</li>
        <li>{even3}</li>
      </ul>

      <h2>Merged Players (Spread):</h2>
      <ul>
        {mergedPlayers.map((p, i) => <li key={i}>{p}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
