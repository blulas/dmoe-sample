# IBM Business Automation - Decision Manager Open Edition - Customer Demo

This repository contains a sample fact model and decision service, used for demonstrating the capabilities of Decision Manager Open Edition, based on Kogito.

## How To Build

This repository is built using `mvn clean install` by either the CI/CD pipeline or on a local developer workstation.  

## How To Deploy

This repository is built using `mvn clean deploy` by either the CI/CD pipeline or on a local developer workstation. 

## Repository Modules

This repository is organized in a series of modules:  

1.  [**Fact Model**](./fact-model/readme.md) - A set of Java classed used by the sample decision services.
2.  [**Decision Services**](./decision-services/readme.md) - A set of sample decision services written using `Kogito` and `rule units`.

## Tool & Environment Requirements

The following tools and frameworks are required to be installed on the developer workstation.  Please follow the link in order to download and install the various tools:

1. [**Maven**](https://maven.apache.org) - Required in order to perform Maven builds on the desktop.  
2. [**Git Client**](https://git-scm.com) - Required in order to clone and make changes to the project GIT repositories
3. [**JDK 11**](https://www.oracle.com/java/technologies/downloads/) - Requires Java 11 at this time
4. [**GraalVM (Optional)**](https://www.graalvm.org//) - Required if you want to test NATIVE compilation and deployment
5. [**VS Code IDE**](https://code.visualstudio.com/download) - An IDE is required, VS Code IDE is the default.  While you can use any IDE you wish, the embeddable editors are only available for VS Code.

*_Once you have installed VS Code, you can go to the Extensions Marketplace and install the `Kogito Bundle` for BPMN, DMN, and Test Scenarios_*.

## Additional Information (*Appendicies*)
This repository is focused on business automation using **IBM Decison Manager Open Edition** products, which in turn rely on various open source tools and technology. The following online documentation is available in order to learn various aspects of these tools:

- [**Apache Maven**](https://maven.apache.org/) is a free and open source software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project???s build, reporting and documentation from a central piece of  information. A **getting started guide** is available [here](http://maven.apache.org/guides/getting-started/).
- [**Git**](https://git-scm.com//) is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency. There is a **handbook** available [here](https://guides.github.com/introduction/git-handbook/), as well as various **guides** for learning and working with Git available [here](https://guides.github.com/
- [**Quarkus**](https://quarkus.io) Quarkus was created to enable Java developers to create applications for a modern, cloud-native world. Quarkus is a Kubernetes-native Java framework tailored for GraalVM and HotSpot, crafted from best-of-breed Java libraries and standards. The goal is to make Java the leading platform in Kubernetes and serverless environments while offering developers a framework to address a wider range of distributed application architectures.
- [**Kogito**](https://kogito.kie.org) Kogito is designed from ground up to run at scale on cloud infrastructure. If you think about business automation think about the cloud as this is where your business logic lives these days. By taking advantage of the latest technologies (Quarkus, knative, etc.), you get amazingly fast boot times and instant scaling on orchestration platforms like Kubernetes.
- [**Drools Rule Language (DRL)**](https://docs.drools.org/8.28.0.Beta/drools-docs/docs-website/drools/language-reference/index.html) Drools Rule Language (DRL) is a notation established by the Drools open source business automation project for defining and describing business rules. You define DRL rules in .drl text files. A DRL file can contain one or more rules that define at a minimum the rule conditions (when) and actions (then).
- [**Decision Model and Notation (DMN)**](https://www.omg.org/dmn/) is a modeling language and notation for the precise specification of business decisions and business rules. DMN is easily readable by the different types of people involved in decision management. These include: business people who specify the rules and monitor their application; business analysts.
- [**IBM Decision Manager Open Editions**](https://www.ibm.com/docs/en/ibamoe) which consists of `IBM Process Automation Manager` and `IBM Decision Manager Open Edition`, offer developers the ability to build cloud-native applications that automate business operations. `IBM Process Automation Manager Open Edition` is a platform for developing containerized microservices and applications that automate processes and business decisions. `IBM Decision Manager Open Edition`, a subset of `IBM Process Automation Manager Open Edition`, is a separately available platform for developing containerized microservices and applications that automate business decisions, including complex event processing.