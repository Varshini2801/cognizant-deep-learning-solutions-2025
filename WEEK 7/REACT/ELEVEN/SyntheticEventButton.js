import React from 'react';

const SyntheticEventButton = () => {
  const handleClick = (event) => {
    event.preventDefault(); // Synthetic event usage
    alert("I was clicked");
    console.log("Synthetic Event:", event);
  };

  return (
    <div>
      <h2>Synthetic Event Example</h2>
      <button onClick={handleClick}>Click Me</button>
    </div>
  );
};

export default SyntheticEventButton;
