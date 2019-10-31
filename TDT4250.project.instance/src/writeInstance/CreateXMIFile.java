package writeInstance;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import competition.Competition;
import competition.Team;
import competition.CompetitionFactory;
import competition.CompetitionPackage;

public class CreateXMIFile {
	
	// Reference: https://www.vogella.com/tutorials/EclipseEMFPersistence/article.html#example
	
	
	public static void main(String[] args) {
		// Initialize the model
		CompetitionPackage.eINSTANCE.eClass();
        // Retrieve the default factory singleton
		CompetitionFactory factory = CompetitionFactory.eINSTANCE;

        // create the content of the model via this program
		Competition competition = factory.createCompetition();
        Team team = factory.createTeam();
        team.setName("Manchester United");
        team.setId(2);
        team.setShortName("ManUtd");
        team.setTla("MAN");
        team.setFounded(1940);
        team.setClubColors("Red");
        competition.getTeams().add(team);

        // As of here we preparing to save the model content

        // Register the XMI resource factory for the .website extension

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // create a resource
        Resource resource = resSet.createResource(URI
                .createURI("sample/sample.xmi"));
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(competition);

        // now save the content.
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

	}

}
