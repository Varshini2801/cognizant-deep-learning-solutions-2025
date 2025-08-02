import React, { Component } from 'react';

class Counter extends Component {
  constructor(props) {
    super(props);
    this.state = { count: 0 };

    // Binding 'this' to methods
    this.increment = this.increment.bind(this);
    this.sayHello = this.sayHello.bind(this);
  }

  increment() {
    this.setState({ count: this.state.count + 1 });
    this.sayHello();
  }

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  }

  sayHello() {
    console.log("Hello! Counter button clicked.");
    alert("Hello! You clicked the increment button.");
  }

  render() {
    return (
      <div>
        <h2>Counter Example</h2>
        <p>Count: {this.state.count}</p>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
      </div>
    );
  }
}

export default Counter;
