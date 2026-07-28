import React from 'react';
import { useParams } from 'react-router-dom';
import { trainers } from './TrainersMock';
function TrainerDetail() {
    const { id } = useParams();
    const trainer = trainers.find(t => t.TrainerId.toString() === id);
    if (!trainer) {
        return <h3>Trainer not found</h3>;
    }
    return (
        <div style={{ border: '1px solid black', padding: '15px', marginTop: '10px' }}>
            <h3>Trainer Details</h3>
            <p>ID: {trainer.TrainerId}</p>
            <p>Name: {trainer.Name}</p>
            <p>Email: {trainer.Email}</p>
            <p>Phone: {trainer.Phone}</p>
            <p>Technology: {trainer.Technology}</p>
            <p>Skills: {trainer.Skills}</p>
        </div>
    );
}
export default TrainerDetail;
