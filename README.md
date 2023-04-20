# BC_DesignPatterns
"DESIGN PATTERNS PROJECT

-> choose 2 design patterns and provide concrete implementations for them

-> find a real-world scenario to apply the design patterns bearing in mind that a 
"design pattern" is a solution to a problem in a given context

-> both design pattern implementations should be used in the same, larger scenario

-> resulting java project sources should be uploaded to GitHub on a public repository"


In this project, we're building a coffee shop where customers can order different types
of coffee with various options, such as sugar or milk. We're using the Composite
pattern to create a CoffeeMenu that can hold multiple coffee items, and we're using
the Decorator pattern to add extra options to our coffee items.

The CoffeeItem interface represents a coffee item, which has a cost 
and a description. We have three concrete classes for different types of 
coffee: Espresso, Latte, and Cappuccino. These classes implement 
the CoffeeItem interface and provide their own cost and description.

The CoffeeMenu class is a composite class that can hold multiple coffee items.
It implements the CoffeeItem interface and has a list of coffee items. 
The getCost() method of CoffeeMenu calculates the total cost of all the coffee 
items in the list, and the getDescription() method returns a string with the description 
of each coffee item separated by commas.

Finally, we use the Decorator pattern to add extra options to our coffee items. 
We have two decorator classes: Sugar and Milk. These classes extend the CoffeeDecorator
abstract class, which itself implements the CoffeeItem interface. The Sugar and Milk classes 
have a CoffeeItem object as a member variable, and they override the getCost() and getDescription()
methods to add their own cost and description to the wrapped coffee item.

Overall, this project allows us to create and order different types of coffee with various options,
and it demonstrates the use of the Composite and Decorator design patterns in Java.
