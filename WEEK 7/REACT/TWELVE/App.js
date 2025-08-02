import React, { useState } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';
import FlightDetails from './FlightDetails';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  // Handlers
  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  // Element Variable for Page Content
  let pageContent;

  if (isLoggedIn) {
    pageContent = <UserPage />;
  } else {
    pageContent = <GuestPage />;
  }

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>✈️ Ticket Booking App</h1>

      {/* Login/Logout Button */}
      {isLoggedIn ? (
        <button onClick={handleLogout}>Logout</button>
      ) : (
        <button onClick={handleLogin}>Login</button>
      )}

      {/* Page Content (Conditional Rendering) */}
      {pageContent}

      {/* Flight Details (Always Rendered) */}
      <FlightDetails />
    </div>
  );
}

export default App;
