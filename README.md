# Football result - Advanced Software Engineering (TDT4250) semester project

_Members: Mats Davidsen, Henrik Finnerud Larsen, Siri Mykland and Mats Tyldum_

## Description

This project aim to visualize information from different football competions using an API provided by [football-data.org](https://www.football-data.org/) to gather data. The data is fetched from the API, transformed and mapped to an Ecore model and
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

The repository includes data files (JSON format) used in the representation. If you want to, new data can be fetched from the API. The JSON files and Ecore models will then reflect the new updates:

- Navigate to "TDT4250.project.resource/src/fetch"
- Run "Main.java" as "Java Application"

### Open and edit view

Opening the view, with the possibilty for editing can be done like this.

- Click run as Eclipse application.
- Import these projects to the new workspace: "TDT4250.project.design", "TDT4250.project.model" and "TDT4250.project.samples".
- Views:
  - Open the "representations.aird" file in the "TDT4250.project.samples" project.
  - Select the view you want to open in the "Representations" tab.
- Editing:
  - Open the "project.odesign" file in the "TDT4250.project.design/description" folder.

## Fetching and transformation
The fetching and transformation is handled in the TDT4250.project.resource project. The data is fetched and saved to JSON-files in the data folder by the ApiFetcher class. 

Mapping and transformation is handled in the "Mapping" class. The JSON-files are mapped to a corresponding model using the Jackson library. This model is transformed to our Ecore model using a custom model to model transformation (M2M), creating a sample.xmi file containing instances of the Ecore model. This file is saved in the TDT4250.project.sample project and later used for the Sirius visualization.

The transformation is independent of the league used as the data source. For example you can fetch data from German Bundesliga instead of Premier League only by changing the link in the ApiFetcher class.

## Model
One competition contains multiple teams and the current season. 
The season contains a standing of positions of the teams and multiple matchdays. A match day contains multiple matches which all contains a score and two teams; homeTeam and awayTeam. 

The model also contains two Enums; status of a match and winner of the match.
![Image of the Ecore model](https://github.com/matseda/TDT4250.Project/blob/master/images/Model_diagram.png)

## Viewpoints
This project includes different viewpoints to visualize data. Description and images of these views will be presented below.

### Diagrams
One of the main features of the Sirius framework is the ability to create diagrams. Three diagrams: Season, match and team have been developed. Each including different features from the diagram tool.

- Season: This diagram visualizes all the matchdays in a season split into two categories, completed matches(results) and future matches (fixtures). These categories are represented using two layers, making it possible to view only result, fixtures or both depending on what you want. In addition to this, filter functions has also been added. Two filters "Liverpool matches" and "No draws" makes it possible to hide all matches which not correspond to these facts. The filters and pages can be selected using the two button shown below in Eclipse, the left button selects pages and the right one selects filters.
![Pages and filtering](./images/Filter_layer_buttons.png)

The filters can be applied individually or together as illustrated in the figures below.
  - All matches ![All matches season diagram](./images/Season_view.png)
  - Liverpool matches ![Liverpool matches season diagram](./images/Season_liverpool_view.png)
  - Matches with no draws ![No draws season diagram](./images/Season_no_draws_view.png)
  
There are also diagrams for showing a single match and a single team, you can navigate to these diagrams as described in the next subsection. These diagrams are displayed below
- Match: The match diagram lists information of each match.
  ![Liverpool match diagram](./images/Matches_Liverpool_view.png)
- Team: The team diagram lists all information about a team together with season stats. The season stats are calculated using OCL expressions.
  ![No draws season diagram](./images/Liverpool_team_view.png)

### Navigation between diagrams
It is possible to navigate between diagrams and create new ones if they don't exist by double-clicking on different nodes. Navigation is possible:
- From season to match diagram. Double click on a match to view the corresponding match diagram.
- From match to team diagram. Double click "view home team" or "view away team" to navigate to the corresponding teams diagram
If a diagram already exist you will end up in that view. If not a popup will prompt you to create a new one.
![Popup new diagram](./images/New_diagram_popup.png)

### Table
The Season table is an Edition Table representing the Standings of the current season, where each line represent a position in the standings and each column represents a property of that position. The table uses features such as:
- Property views for position: Pointing to the Position property view.
- Conditional styles for Premier League using OCL:
    - Visualize teams qualified for Champions League (top 4) with a green background. 
    - Visualize teams qualified for Europa League (position 5) with a blue background.
    - Visualize teams that are beein relegated (bottom 3) with a red background.
    - Different color for positive and negative goal difference: Red for negative and green for positive.
![Image of Season Table View](./images/Table_view.png)

### Tree
The Tree View representation provides a hierarchical viewpoint of the Football Season. Each node in the tree represents an element, with Season being the root node. 
- Season
  - Matchdays
    - Match details
![Image of Season Tree View](./images/Tree_view.png)

## Property Views 
The Property View of for position elements show three extra pages. The view is displayed when Position objects are marked.
i.e. in the Season Table, if the row of Arsenal FC is clicked, one will see the view in the image below.
- Info
  - Team
  - Points
  - Position
  - Played
- Matches
  - Won
  - Lost
  - Draw
- Goals
  - For
  - Against
  - Difference

![Image of the Property View](./images/Arsenal_property_view.png)


