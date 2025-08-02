import React, { useState } from 'react';

const CurrencyConvertor = () => {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState('');

  const handleChange = (e) => {
    setRupees(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault(); // Prevent reload
    const conversionRate = 0.011; // Example rate: ₹1 = €0.011
    const converted = (rupees * conversionRate).toFixed(2);
    setEuros(converted);
  };

  return (
    <div>
      <h2>Currency Convertor (INR ➡️ EUR)</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          value={rupees}
          onChange={handleChange}
          placeholder="Enter amount in INR"
        />
        <button type="submit">Convert</button>
      </form>
      {euros && <p>Converted Amount in Euro: €{euros}</p>}
    </div>
  );
};

export default CurrencyConvertor;
