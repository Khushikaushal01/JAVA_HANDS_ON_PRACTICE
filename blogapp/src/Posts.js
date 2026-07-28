import React from 'react';
import Post from './Post';
class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            error: null
        };
    }
    loadPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.json();
            })
            .then(data => {
                const mappedPosts = data.slice(0, 10).map(p => new Post(p.id, p.title, p.body));
                this.setState({ posts: mappedPosts });
            })
            .catch(err => {
                this.setState({ error: err.message });
            });
    }
    componentDidMount() {
        this.loadPosts();
    }
    componentDidCatch(error, errorInfo) {
        alert('Error in component: ' + error.toString());
    }
    render() {
        if (this.state.error) {
            return <div>Error loading posts: {this.state.error}</div>;
        }
        return (
            <div>
                <h1>Blog Posts</h1>
                {this.state.posts.map(post => (
                    <div key={post.id} style={{ borderBottom: '1px solid gray', padding: '10px' }}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }
}
export default Posts;
