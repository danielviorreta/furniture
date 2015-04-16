# furniture
Project to show Strategy and Observer design patterns working 

Problem description:
We have a lot of furniture objects where the have two behaviours. One behaviour is the resistence to temperature and the other one is the resistence to weight. Each furniture has a different material and then different behaviours. We need a system a handle this being the most maintainable as we can.

Solution:
We have encapsulate each behaviour in a different strategy following the [Strategy pattern design](http://en.wikipedia.org/wiki/Strategy_pattern). Each behaviour is notified when a change of temperature or weight ocurrs using the [Observer design pattern](http://en.wikipedia.org/wiki/Observer_pattern).
