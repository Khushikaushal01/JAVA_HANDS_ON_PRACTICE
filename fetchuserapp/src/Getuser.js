import React from 'react';
class Getuser extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            user: null,
            loading: true
        };
    }
    async componentDidMount() {
        try {
            const res = await fetch('https://api.randomuser.me/');
            const data = await res.json();
            if (data.results && data.results.length > 0) {
                this.setState({ user: data.results[0], loading: false });
            }
        } catch (e) {
            console.error(e);
        }
    }
    render() {
        if (this.state.loading) {
            return <h3>Loading user...</h3>;
        }
        const { name, picture, email } = this.state.user;
        return (
            <div style={{ border: '1px solid black', padding: '20px', width: '300px', margin: '20px auto', textAlign: 'center' }}>
                <img src={picture.large} alt="user" style={{ borderRadius: '50%' }} />
                <h2>{name.title} {name.first} {name.last}</h2>
                <p>Email: {email}</p>
            </div>
        );
    }
}
export default Getuser;
