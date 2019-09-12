package twelve.total.duck;

import twelve.total.duck.factory.DuckFactory;
import twelve.total.duck.factory.RealDuckCounterFactory;
import twelve.total.duck.factory.RealDuckFactory;
import twelve.total.duck.quackable.DuckGroup;
import twelve.total.duck.quackable.DuckSimulator;
import twelve.total.duck.quackable.Goo;
import twelve.total.duck.quackable.GooseAdaptor;
import twelve.total.duck.quackable.GooseQuack;
import twelve.total.duck.quackable.Hook;
import twelve.total.duck.quackable.Quack;
import twelve.total.duck.quackable.QuackCounter;
import twelve.total.duck.quackable.QuackCounterD;
import twelve.total.duck.quackable.Quackable;

public class duckTester {
	
	public static void main(String...strings) {
		
	}
	
	public static void count(QuackCounter counter) {
		System.out.println(counter.count());
	}
	
	//adaptor,decorator
	public static void testCase1() {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate(new Goo());
		simulator.simulate(new Hook());
		simulator.simulate(new Quack());
		simulator.simulate(new GooseAdaptor(new GooseQuack()));
		Quackable duck = new QuackCounterD(new Goo());
		duck.quack();
		duck.quack();
		count((QuackCounter) duck);
	}
	
	//adaptor,decorator,factory
	public static void testCase2() {
		DuckSimulator simulator = new DuckSimulator();
		DuckFactory factory = new RealDuckFactory();
		Quackable duck = factory.createGoo();
		simulator.simulate(duck);
		DuckFactory counterFactory = new RealDuckCounterFactory(factory);
		Quackable countDuck = counterFactory.createGoo();
		Quackable countDuck2 = counterFactory.createGoose();
		countDuck.quack();
		countDuck.quack();
		countDuck2.quack();
		countDuck2.quack();
		count((QuackCounter) countDuck);
	}
	
		//adaptor,decorator,factory,composite
		public static void testCase3() {
			DuckSimulator simulator = new DuckSimulator();
			DuckFactory factory = new RealDuckCounterFactory(new RealDuckFactory());
			Quackable duck1 = factory.createGoo();
			Quackable duck2 = factory.createGoose();
			Quackable duck3 = factory.createHook();
			Quackable duck4 = factory.createQuack();
			DuckGroup ducks = new DuckGroup();
			ducks.add(duck1,duck2,duck3,duck4);
			simulator.simulate(ducks);
			count((QuackCounter) duck1);
			
		}
		
		//observer
		public static void testCase4() {
			DuckSimulator simulator = new DuckSimulator();
			DuckFactory factory = new RealDuckFactory();
			factory.createGoo().registry(simulator);
			factory.createHook().registry(simulator);
			simulator.published();
		}
		
		//adaptor,decorator,factory
		public static void testCase() {
		}
	
}
