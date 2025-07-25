import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div>
      <CohortDetails
        name="React Bootcamp"
        status="ongoing"
        startDate="2025-06-01"
        endDate="2025-08-30"
      />
      <CohortDetails
        name="Angular Bootcamp"
        status="completed"
        startDate="2025-03-01"
        endDate="2025-05-30"
      />
    </div>
  );
}

export default App;
