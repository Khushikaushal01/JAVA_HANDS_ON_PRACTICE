import React, { useState } from 'react';
import CurrencyConverter from './CurrencyConverter';
function App() {
    const [counter, setCounter] = useState(0);

    const handleIncrement = () => {
        setCounter(prev => prev + 1);
        alert('Hello! The counter has been incremented.');
    };

    const handleDecrement = () => {
        setCounter(prev => prev - 1);
    };

    const sayWelcome = (msg) => {
        alert('Welcome Message: ' + msg);
    };

    const handlePress = (e) => {
        alert('I was clicked! Event type: ' + e.type);
    };

    return (
        <div style={{ padding: '20px' }}>
            <h2>Event Examples</h2>
            <div>
                <p>Counter: {counter}</p>
                <button onClick={handleIncrement}>Increment</button>
                <button onClick={handleDecrement} style={{ marginLeft: '10px' }}>Decrement</button>
            </div>
            <hr />
            <button onClick={() => sayWelcome('welcome')}>Say Welcome</button>
            <button onClick={handlePress} style={{ marginLeft: '10px' }}>OnPress</button>
            <hr />
            <CurrencyConverter />
        </div>
    );
}
export default App;
