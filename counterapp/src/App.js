import React from 'react';
class CountPeople extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            entrycount: 0,
            exitcount: 0
        };
    }
    updateEntry = () => {
        this.setState({ entrycount: this.state.entrycount + 1 });
    };
    updateExit = () => {
        this.setState({ exitcount: this.state.exitcount + 1 });
    };
    render() {
        return (
            <div style={{ padding: '20px' }}>
                <h2>Mall Footfall Tracker</h2>
                <p>People Entered: {this.state.entrycount}</p>
                <p>People Exited: {this.state.exitcount}</p>
                <button onClick={this.updateEntry}>Login</button>
                <button onClick={this.updateExit} style={{ marginLeft: '10px' }}>Exit</button>
            </div>
        );
    }
}
export default CountPeople;
