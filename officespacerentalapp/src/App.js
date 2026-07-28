import React from 'react';
function App() {
    const heading = <h1>Office Space Rental Options</h1>;
    const officeSpaces = [
        { name: 'DBS Business Center', rent: 55000, address: 'Nungambakkam, Chennai' },
        { name: 'Regus Tech Park', rent: 75000, address: 'OMR, Chennai' },
        { name: 'WeWork Co-Working', rent: 48000, address: 'Guindy, Chennai' },
        { name: 'Awfis Space', rent: 62000, address: 'T Nagar, Chennai' }
    ];
    return (
        <div style={{ padding: '20px' }}>
            {heading}
            <ul>
                {officeSpaces.map((office, idx) => {
                    const rentColor = office.rent < 60000 ? 'red' : 'green';
                    return (
                        <li key={idx} style={{ marginBottom: '15px', borderBottom: '1px solid #ccc', paddingBottom: '10px' }}>
                            <h3>{office.name}</h3>
                            <p>Address: {office.address}</p>
                            <p>Rent: <span style={{ color: rentColor, fontWeight: 'bold' }}>Rs. {office.rent}</span></p>
                        </li>
                    );
                })}
            </ul>
        </div>
    );
}
export default App;
