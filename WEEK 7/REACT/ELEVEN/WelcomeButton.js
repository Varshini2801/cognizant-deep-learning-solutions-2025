import React from 'react';

function WelcomeButton() {
  const sayWelcome = (msg) => {
    alert(`You said: ${msg}`);
  };

  return (
    <div>
      <h2>Welcome Button</h2>
      <button onClick={() => sayWelcome("Welcome")}>Say Welcome</button>
    </div>
  );
}

export default WelcomeButton;
