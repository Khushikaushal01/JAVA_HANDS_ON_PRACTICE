import React from 'react';
import '../Stylesheets/mystyle.css';
export const CalculateScore = ({ Name, School, Total, goal }) => {
    const average = Total / goal;
    return (
        <div className="formatstyle">
            <h1>Score Calculator</h1>
            <div className="details">
                <p>Student Name: {Name}</p>
                <p>School: {School}</p>
                <p>Total: {Total}</p>
                <p>Goal: {goal}</p>
                <p>Average: {average.toFixed(2)}</p>
            </div>
        </div>
    );
};
