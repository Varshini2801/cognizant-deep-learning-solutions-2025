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

  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => {
        if (!response.ok) throw new Error("Failed to fetch");
        return response.json();
      })
      .then(data => this.setState({ posts: data }))
      .catch(error => {
        this.setState({ error });
        throw error; // for componentDidCatch
      });
  };

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert("Something went wrong: " + error.message);
    console.error("Error details:", info);
  }

  render() {
    if (this.state.error) {
      return <h2>Something went wrong while fetching posts.</h2>;
    }

    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
