# CLAUDE.md - AI Assistant Guide for Head First Design Patterns

## Project Overview

This repository contains the complete code examples for **Head First Design Patterns (2nd Edition, 2020)**. It is an educational codebase implementing all 23 Gang of Four design patterns using Java 8+ with practical, real-world examples.

**Primary Purpose**: Learning and teaching software design patterns through executable examples.

## Technology Stack

- **Language**: Java 8+
- **Build Tool**: Maven 3+ (with Maven Wrapper included)
- **IDE Support**: Eclipse, IntelliJ IDEA
- **Dependencies**: Minimal (javax.servlet-api 4.0.0)
- **Project Type**: Multi-pattern educational examples (not a production application)

## Codebase Structure

### Root Directory Layout

```
/
├── src/                          # All source code
│   └── headfirst/designpatterns/ # Root package for all patterns
├── pom.xml                       # Maven build configuration
├── mvnw, mvnw.cmd               # Maven wrapper scripts
├── README.md                     # User-facing documentation
└── CLAUDE.md                     # This file - AI assistant guide
```

### Source Code Organization

**Base Package**: `headfirst.designpatterns`

**Pattern Directory Structure**:
```
src/headfirst/designpatterns/
├── PATTERN_NAME/               # One directory per pattern
│   ├── Core interfaces/classes # Pattern abstractions
│   ├── Concrete classes        # Implementations
│   ├── *TestDrive.java        # Executable demo (main method)
│   ├── *Simulator.java        # Simulation demo (main method)
│   └── VARIANT_NAME/          # Pattern variations/evolutions
│       └── ...                 # Variant-specific code
```

### Design Patterns Implemented (23 Total)

| Category | Patterns | Key Directories |
|----------|----------|-----------------|
| **Creational** | Factory Method, Abstract Factory, Singleton, Builder, Prototype | `factory/`, `singleton/`, `builder/`, `prototype/` |
| **Structural** | Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy | `adapter/`, `bridge/`, `composite/`, `decorator/`, `facade/`, `flyweight/`, `proxy/` |
| **Behavioral** | Observer, Strategy, Command, State, Template Method, Iterator | `observer/`, `strategy/`, `command/`, `state/`, `templatemethod/`, `iterator/` |
| **Special** | Combined patterns, Pattern combinations | `combined/`, `combining/` |

### Notable Pattern Subdirectories

**Patterns with Multiple Variants**:
- **singleton/**: 7 variants (classic, threadsafe, dcl, enumS, stat, subclass, chocolate)
- **command/**: 9 variants including Lambda versions (dinerLambda, remoteWL, simpleremoteWL)
- **observer/**: 4 variants (weather, weatherobservable, simple, swing)
- **factory/**: 4 variants (pizzas, pizzafm, pizzaaf, challenge)
- **decorator/**: 4 variants (starbuzz, starbuzzWithSizes, pizza, io)

**Special Combined Patterns**:
- **combined/djview/**: Full MVC application with Observer, Adapter, Strategy patterns + JSP servlets
- **combining/**: Demonstrates multiple patterns working together (71 files)

## Naming Conventions

### Package Naming
```
headfirst.designpatterns.PATTERN_NAME
headfirst.designpatterns.PATTERN_NAME.VARIANT_NAME
```

### Class Naming Patterns

**Executable Demo Classes** (contain `main()` methods):
- `*TestDrive.java` - Most common (e.g., `DuckTestDrive.java`, `PizzaTestDrive.java`)
- `*Simulator.java` - Simulation examples (e.g., `MiniDuckSimulator.java`)
- `*Director.java` - Builder pattern directors
- `*Client.java` - Client code demonstrations
- `*Cafe.java`, `*Diner.java` - Scenario-based examples

**Pattern Components**:
- Interfaces: Often named after pattern role (e.g., `Observer.java`, `Subject.java`, `Command.java`)
- Abstract classes: Base implementations (e.g., `Beverage.java`, `CondimentDecorator.java`)
- Concrete classes: Descriptive names (e.g., `MallardDuck.java`, `Espresso.java`, `Mocha.java`)

### File Organization Principles

1. **One pattern per top-level directory** under `src/headfirst/designpatterns/`
2. **Variants in subdirectories** showing pattern evolution or alternative implementations
3. **Self-contained examples** - each variant can be run independently
4. **Minimal cross-pattern dependencies** - patterns are isolated for learning

## Development Workflows

### Building the Project

```bash
# Install dependencies
./mvnw install

# Clean build
./mvnw clean install

# Compile only
./mvnw compile
```

### IDE Setup

```bash
# Generate Eclipse project files
./mvnw eclipse:eclipse

# Generate IntelliJ IDEA project files
./mvnw idea:idea
```

### Running Examples

**Direct Java Execution**:
```bash
# After compilation, run any TestDrive class
java -cp target/classes headfirst.designpatterns.strategy.MiniDuckSimulator
java -cp target/classes headfirst.designpatterns.observer.weather.WeatherStation
```

**Maven Execution**:
```bash
# Use exec plugin (if configured)
./mvnw exec:java -Dexec.mainClass="headfirst.designpatterns.PATTERN.TestDrive"
```

### Common Tasks

**Finding all executable examples**:
```bash
# Search for classes with main methods
grep -r "public static void main" src/
```

**Locating a specific pattern**:
```bash
# Pattern directories are at src/headfirst/designpatterns/PATTERN_NAME/
ls src/headfirst/designpatterns/
```

## AI Assistant Guidelines

### When Working with This Codebase

1. **Understand the Educational Context**
   - This is a learning repository, not production code
   - Examples prioritize clarity and teaching over optimization
   - Code duplication across variants is intentional for pedagogical reasons
   - Comments and verbose naming are features, not bugs

2. **Respect Pattern Isolation**
   - Each pattern directory is self-contained
   - Avoid creating cross-pattern dependencies unless in `combining/` or `combined/`
   - Changes to shared classes (e.g., `ducks/`) affect multiple patterns

3. **Maintain Consistency with Existing Code**
   - Follow established naming conventions (`*TestDrive`, `*Simulator`)
   - Keep the simple, educational style of existing code
   - Preserve comments that explain pattern concepts
   - Match indentation and formatting of surrounding code

4. **When Adding New Pattern Examples**
   - Create subdirectory under appropriate pattern (e.g., `strategy/newvariant/`)
   - Include at least one executable class with `main()` method
   - Add clear comments explaining the pattern demonstration
   - Follow package naming: `headfirst.designpatterns.PATTERN.VARIANT`

5. **When Modifying Existing Patterns**
   - Read the original implementation first to understand the teaching goal
   - Preserve the pedagogical value of the example
   - If improving code, ensure it remains beginner-friendly
   - Test the executable examples after changes

6. **Testing Approach**
   - This repository uses manual testing via `main()` methods
   - No unit testing framework is configured (educational focus)
   - Verify changes by running the relevant `*TestDrive` classes
   - Ensure output demonstrates the pattern correctly

7. **Documentation Standards**
   - Inline comments should explain *why* (pattern concepts), not *what* (obvious code)
   - Class-level JavaDoc should describe the pattern role
   - Keep explanations simple and accessible to beginners
   - Reference the Head First Design Patterns book when relevant

### Code Style Conventions

**Java Version**: Java 8 features are acceptable (lambdas, streams)
- Some patterns have explicit lambda variants (e.g., `command/dinerLambda/`)
- Default to classic Java for pattern demonstrations unless showing modern alternatives

**Formatting**:
- Indentation: Tabs or spaces matching existing code in that directory
- Braces: Opening brace on same line (`if (condition) {`)
- Line length: No strict limit, prioritize readability

**Naming**:
- Classes: PascalCase
- Methods: camelCase
- Constants: UPPER_SNAKE_CASE
- Packages: lowercase, no underscores

### Common Pitfalls to Avoid

1. **Don't over-engineer examples** - Keep them simple and focused
2. **Don't add production-grade features** - No logging frameworks, complex error handling, etc.
3. **Don't remove pattern "smells"** - Some patterns intentionally show problems before solutions
4. **Don't consolidate duplicate code** - Variants are meant to be standalone
5. **Don't add external dependencies** - Keep the project lightweight

### Pattern-Specific Notes

**Singleton Pattern** (`singleton/`):
- Multiple variants show evolution from flawed to correct implementations
- Thread-safety examples are teaching tools, not production recommendations
- Enum singleton (`enumS/`) is the recommended modern approach

**Factory Pattern** (`factory/`):
- `pizzafm/` = Factory Method pattern
- `pizzaaf/` = Abstract Factory pattern
- Don't mix these distinct pattern variants

**Observer Pattern** (`observer/`):
- `weather/` = Custom implementation (push model)
- `weatherobservable/` = Java's built-in Observable (deprecated in Java 9+)
- Keep both for comparison purposes

**Command Pattern** (`command/`):
- Largest pattern directory (94 files, 9 variants)
- Lambda variants demonstrate modern Java alternatives
- Each variant is a complete, self-contained example

**Combined/Combining** (`combined/`, `combining/`):
- Shows real-world usage of multiple patterns together
- More complex than individual pattern examples
- `combined/djview/` includes web components (JSP, servlets)

### File Paths Reference

**Pattern locations** (all under `/home/user/Head-First-Design-Patterns/src/headfirst/designpatterns/`):

```
adapter/      - Adapter pattern (ducks, iterenum)
bridge/       - Bridge pattern (remote controls)
builder/      - Builder pattern (pizza, house, vacation)
collections/  - Collection patterns (iterator)
combined/     - Multi-pattern MVC application (djview)
combining/    - Pattern combination examples
command/      - Command pattern (9 variants)
composite/    - Composite pattern (menus)
decorator/    - Decorator pattern (starbuzz, pizza, io)
ducks/        - Shared duck classes
facade/       - Facade pattern (home theater)
factory/      - Factory patterns (pizzafm, pizzaaf)
flyweight/    - Flyweight pattern
iterator/     - Iterator pattern (5 variants)
iterenum/     - Iterator/Enumeration adapter
observer/     - Observer pattern (4 variants)
prototype/    - Prototype pattern
proxy/        - Proxy pattern (gumball, virtual, dynamic)
singleton/    - Singleton pattern (7 variants)
state/        - State pattern (gumball machine)
strategy/     - Strategy pattern (ducks)
templatemethod/ - Template Method pattern (6 variants)
```

## Git Workflow

### Branch Strategy
- Main branch: `master`
- Feature branches: `claude/claude-md-*` (for AI assistant work)

### Commit Guidelines
- Keep commits focused on single patterns or concepts
- Use clear commit messages: "Add Builder pattern house example" or "Fix Singleton double-checked locking"
- Reference pattern names in commit messages for clarity

### Testing Before Commit
```bash
# Compile entire project
./mvnw clean compile

# Run affected TestDrive classes manually
java -cp target/classes headfirst.designpatterns.PATTERN.TestDrive
```

## Maven Configuration

**Source Directory**: `src/` (non-standard, typically would be `src/main/java/`)
**Target Java**: 1.8 (source and target)
**Dependencies**: javax.servlet-api 4.0.0 (only for combined/djview web examples)

**Important**: The source directory configuration is non-standard. Most patterns don't use servlets - the dependency is only for the `combined/djview/` examples.

## Resources and External Links

- **Book Website**: http://wickedlysmart.com/head-first-design-patterns/
- **Pattern Reference**: Gang of Four Design Patterns
- **Java Version**: Java 8+ required (for lambda examples)

## Quick Reference Commands

```bash
# List all patterns
ls src/headfirst/designpatterns/

# Find all executable examples
grep -r "public static void main" src/ | cut -d: -f1

# Search for specific pattern usage
grep -r "implements Observer" src/

# Check Java version
java -version

# Verify Maven setup
./mvnw --version

# Full clean build
./mvnw clean install
```

## File Count Summary

- **Total Java Files**: ~677 files
- **Largest Pattern**: Command (94 files)
- **Most Variants**: Command (9 variants), Singleton (7 variants)
- **Pattern Count**: 23 design patterns covered

## Notes for AI Assistants

1. **Always compile and test** changes by running `./mvnw compile` and executing relevant TestDrive classes
2. **Read existing implementations** in a pattern directory before making changes
3. **Preserve educational value** - clarity trumps cleverness in this codebase
4. **Match existing style** - consistency is important for learners
5. **Document pattern concepts** - explain the "why" behind design decisions
6. **Keep variants independent** - don't create shared dependencies between pattern variants
7. **Respect the book's approach** - this code follows the Head First teaching methodology

---

**Last Updated**: 2025-11-13
**Repository**: Head-First-Design-Patterns (2nd Edition)
**Maintainer**: Educational resource for design patterns
