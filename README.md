# functional programming practice

## some excerpts about functional programming

- an imperative program is a functional program turned inside out. What occurs last in an imperative program occurs outermost in a functional one

- Stop thinking about a program as a sequence of operations. Think about the relationship between input and output. Declare outputs in terms of inputs instead of instructing the machine to perform operations. The shift in thinking might be as subtle as in declaring x to be the sum of 2+2 rather than telling the machine to add 2 to 2 and store it in x. Declare the set of solutions to a sudoku puzzle as the subset of all possible diagrams filled with numbers, which fulfill certain conditions.


- That's one thing I should mention: You change state by calling a function, not by making an assignment (at least if you're striving for pure FP).

- And this is, in fact, what you are after: thinking like a functional programmer means intuitively knowing that a given problem can be expressed in terms of a given abstraction (or rather compositions of abstractions).

- Closures have three useful properties: a) they are active, b) they have local state, and c) we can make multiple instances of them.

- A closure is also a collection of state and a function that operates on that state.

Functional Programming
- avoid state and mutability
- everything is a function
- functions should be pure (referential transparency)
- shouldn't maintain state
- 
