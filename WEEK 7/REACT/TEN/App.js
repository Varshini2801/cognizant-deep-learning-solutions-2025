import React from 'react';

const App = () => {
  // Heading using JSX
  const heading = <h1>Office Space Rental Listings</h1>;

  // Office image attribute
  const officeImage = "https://via.placeholder.com/300x150?text=Office+Space";

  // Single office object
  const office = {
    name: "Green Tower",
    rent: 75000,
    address: "MG Road, Bangalore"
  };

  // List of office space objects
  const officeList = [
    { id: 1, name: "Tech Park", rent: 55000, address: "HSR Layout" },
    { id: 2, name: "Eco World", rent: 68000, address: "Sarjapur Road" },
    { id: 3, name: "Infinity Hub", rent: 45000, address: "Whitefield" },
    { id: 4, name: "Global Space", rent: 92000, address: "Electronic City" }
  ];

  // Function to apply color based on rent
  const rentStyle = (rent) => ({
    color: rent < 60000 ? 'red' : 'green',
    fontWeight: 'bold'
  });

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      {heading}

      <img src={officeImage} alt="Office" style={{ width: "300px", height: "150px" }} />

      <h2>Featured Office</h2>
      <p><strong>Name:</strong> {office.name}</p>
      <p><strong>Rent:</strong> <span style={rentStyle(office.rent)}>{office.rent}</span></p>
      <p><strong>Address:</strong> {office.address}</p>

      <h2>Available Listings</h2>
      <ul>
        {officeList.map((item) => (
          <li key={item.id} style={{ marginBottom: '10px' }}>
            <p><strong>Name:</strong> {item.name}</p>
            <p><strong>Rent:</strong> <span style={rentStyle(item.rent)}>{item.rent}</span></p>
            <p><strong>Address:</strong> {item.address}</p>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default App;
