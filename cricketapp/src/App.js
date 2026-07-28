import React from 'react';
function ListofPlayers() {
    const players = [
        { name: 'Virat Kohli', score: 85 },
        { name: 'Rohit Sharma', score: 92 },
        { name: 'KL Rahul', score: 45 },
        { name: 'Hardik Pandya', score: 75 },
        { name: 'Ravindra Jadeja', score: 62 },
        { name: 'Rishabh Pant', score: 80 },
        { name: 'Jasprit Bumrah', score: 10 },
        { name: 'Mohammed Shami', score: 15 },
        { name: 'Yuzvendra Chahal', score: 5 },
        { name: 'Shreyas Iyer', score: 68 },
        { name: 'Suryakumar Yadav', score: 77 }
    ];
    const filteredPlayers = players.filter(p => p.score >= 70);
    return (
        <div>
            <h2>Players with Score >= 70</h2>
            <ul>
                {filteredPlayers.map((p, idx) => (
                    <li key={idx}>{p.name} - {p.score}</li>
                ))}
            </ul>
        </div>
    );
}
function IndianPlayers() {
    const allPlayers = ['Player 1', 'Player 2', 'Player 3', 'Player 4', 'Player 5', 'Player 6'];
    const [odd1, , odd3, , odd5] = allPlayers;
    const [, even2, , even4, , even6] = allPlayers;

    const T20players = ['Virat Kohli', 'Rohit Sharma', 'Hardik Pandya'];
    const RanjiTrophy = ['Priyank Panchal', 'Abhimanyu Easwaran', 'Sarfaraz Khan'];
    const merged = [...T20players, ...RanjiTrophy];

    return (
        <div>
            <h2>Odd Team Players</h2>
            <p>{[odd1, odd3, odd5].join(', ')}</p>
            <h2>Even Team Players</h2>
            <p>{[even2, even4, even6].join(', ')}</p>
            <h2>Merged Squad</h2>
            <ul>
                {merged.map((p, idx) => (
                    <li key={idx}>{p}</li>
                ))}
            </ul>
        </div>
    );
}
function App() {
    const flag = true;
    return (
        <div>
            {flag ? <ListofPlayers /> : <IndianPlayers />}
        </div>
    );
}
export default App;
