import React, { useState } from 'react';
function CurrencyConverter() {
    const [rupees, setRupees] = useState('');
    const [euro, setEuro] = useState(0);

    const handleSubmit = (e) => {
        e.preventDefault();
        const converted = parseFloat(rupees) * 0.011;
        setEuro(converted);
    };

    return (
        <div style={{ marginTop: '20px', border: '1px solid black', padding: '15px' }}>
            <h3>Rupees to Euro Converter</h3>
            <form onSubmit={handleSubmit}>
                <label>Rupees: </label>
                <input type="number" value={rupees} onChange={e => setRupees(e.target.value)} />
                <button type="submit" style={{ marginLeft: '10px' }}>Convert</button>
            </form>
            <p>Euro: {euro.toFixed(2)}</p>
        </div>
    );
}
export default CurrencyConverter;
