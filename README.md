# BIOBUZZ FTC Error 101

Welcome to the BIOBUZZ FTC Error 101 team repository. This project contains the code used to build and operate our FIRST Tech Challenge robot for the 2026-2027 competition season.

This repo is based on the official FTC SDK and includes both the standard FTC framework and our team-specific code for robot control, autonomous routines, teleop behavior, and tuning.

## Team Information

- Team Name: BIOBUZZ FTC Error 101
- Team Number: 32594
- Program: FIRST Tech Challenge
- Season: 2026-2027

## Purpose of This Repository

This repository is the central place for our team’s robot software. It is used to:

- Define the robot’s hardware layout and configuration
- Build autonomous and teleop OpModes
- Control motors, servos, sensors, and IMUs
- Tune movement and game strategy parameters
- Maintain versioned code for competition readiness

## Repository Structure

```text
BIOBUZZ-FTC-Error-101-Code/
├── FtcRobotController/          # FTC SDK base project
│   └── src/main/java/...        # Standard FTC robot controller code
├── TeamCode/                    # Team custom code
│   └── src/main/java/...        # Robot-specific autonomous and teleop code
├── gradle/                      # Gradle configuration files
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
├── README.md
├── LICENSE
└── ...
```

## Team Workflow

Our team develops in a consistent workflow so the robot code stays organized and easy to maintain:

- Write or revise code in `TeamCode`
- Test on the robot and tune values in real conditions
- Review changes before competition use
- Keep autonomous and teleop code clearly separated
- Document important tuning changes and known issues

## Development Focus Areas

### TeleOp
The teleop code is where we control the robot during driver operation. This includes:

- Gamepad input handling
- Motor and servo control
- Driver-specific robot behaviors
- Utility functions for easier maintenance

### Autonomous
Autonomous code is focused on robot accuracy and repeatability, such as:

- Movement and pathing logic
- Sensor-based localization and targeting
- Action sequences and timing
- Competition strategy execution

### Hardware and Tuning
This part of the project is essential for making the robot reliable. It includes:

- IMU setup and calibration
- Motor direction and power tuning
- Servo configuration
- Sensor integration
- Fine-tuning for match play

## Getting Started

### Prerequisites

- Android Studio Narwhal 3 Feature Drop or newer
- FTC SDK dependencies available through Gradle
- A configured FTC robot controller and driver station
- Matching robot hardware and software setup for the current season

### Clone the Repository

```bash
git clone https://github.com/ftcerror101-32594/BIOBUZZ-FTC-Error-101-Code.git
```

Then open the project in Android Studio and allow Gradle to sync the project.

## Coding Standards

We aim to keep our code readable and maintainable:

- Use clear and descriptive names
- Keep logic organized by function
- Comment important sections and tuning values
- Avoid unnecessary duplication
- Test new code before competition use

## Competition Readiness

Before a competition, we verify that:

- The robot code builds successfully
- Autonomous routines are tested and repeatable
- Teleop controls are responsive and reliable
- All sensors and mechanisms are working correctly
- Wiring and battery use are checked
- Code is committed and ready for use on the field

## Useful Resources

- [FIRST Tech Challenge Documentation](https://ftc-docs.firstinspires.org/)
- [FIRST Tech Challenge Community](https://ftc-community.firstinspires.org/)
- [FTC Javadoc](https://javadoc.io/doc/org.firstinspires.ftc)

## Notes

This repository is built on the official FTC SDK, but the team-specific work lives in the custom code under `TeamCode` and other project areas. It is intended to be a practical, competition-focused codebase for our team.

---

BIOBUZZ FTC Error 101
