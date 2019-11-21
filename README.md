# Football result - Advanced Software Engineering (TDT4250) semester project

_Members: Mats Davidsen, Henrik Finnerud Larsen, Siri Mykland and Mats Tyldum_

## Description

This projects aim to visualize information from different football competions. The project uses the api provided by [football-data.org/](https://www.football-data.org/) to gather data on different football competitions. The data is transformed and mapped to a Ecore model and
visualized using Sirius in Eclipse (2019-09).

## Requirements

- Ecore and Eclipse Modelling Framework (EMF) for modelling
- Sirius for visualizing
- Jackson library for mapping JSON

## Set up dev environment

_Note: Sirius and Ecore/EMF need to be installed in advance_

- Clone repo `git clone https://github.com/matseda/TDT4250.Project.git`
- Install Jackson, if you don't have it installed already:
  - Navigate to "Install new software" in Eclipse
  - Click "Add..." to add Orbit repository
  - Insert "http://download.eclipse.org/tools/orbit/downloads/drops/R20170919201930/repository" in location
  - Click "Add"
  - Choose "All Bundles" and check "Jackson-annotations", "Jackson-core" and "jackson-databind"
  - Click "Next" and then "Finish"

### Updating data

The repository includes data files (JSON format) used in the representation. New data can be fetched from the API. The JSON files and Ecore models will then reflect the new updates:

- Navigate to "TDT4250.project.resource/src/fetch"
- Run "Main.java" as "Java Application"

### Open and edit view

Opening the view, with the possibilty for editing can be done like this.

- Click run as Eclipse application.
- Import these projects to the new workspace: "TDT4250.project.design", "TDT4250.project.model" and "TDT4250.project.samples".
- Views:
  - Open the "representations.aird" file in the "TDT4250.project.samples" project.
  - Select the view ypu want to open in the "Representations" tab.
  - TODO: Describe the more on each view when finished.
- Editing:
  - Open the "project.odesign" file in the "TDT4250.project.design/description" folder.
  - TODO: Describe the more on each view when finished.

## Model

TODO: Describe the model

![Image of the Ecore model](https://github.com/matseda/TDT4250.Project/blob/master/images/modelDiagram.png)

### Constraints

TODO: Write constraints in model here

### Diagram

TODO: Insert PlantUML diagram here
