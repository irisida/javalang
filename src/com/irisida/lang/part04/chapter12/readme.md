![](/assets/javarepologo.png)

# The Java programming language - chapter 12

In chapter 12 we're returning to the Swing programs of the previous section and updating them to handle interactivity in the form of button clicks.

- [4.12.1 - Codebase starting point](/src/com/irisida/lang/part04/chapter12/buttonclicks/basecode) - Here we've created the base code we will need for different strategies in this section. What has been created is the `Jframe`, the `JPanel` and the `ToolBar` with button options.
- [4.12.2 - Naive updates using references](/src/com/irisida/lang/part04/chapter12/buttonclicks/naiveupdates) - Here we're passing the Panel into our ToolBox. Each of the EventListeners will now require an instance variable of the panel in order to call the color changing methods we have attached to the class. See the updated [ToolBar](/src/com/irisida/lang/part04/chapter12/buttonclicks/naiveupdates/ToolBar.java), the [CustomPanel](/src/com/irisida/lang/part04/chapter12/buttonclicks/naiveupdates/CustomPanel.java) and the panel is passed in as a param when we create the ToolBar in the [CustomFrame](/src/com/irisida/lang/part04/chapter12/buttonclicks/naiveupdates/CustomFrame.java) class.