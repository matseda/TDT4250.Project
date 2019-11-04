/**
 */
package competition;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Competition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link competition.Competition#getId <em>Id</em>}</li>
 *   <li>{@link competition.Competition#getName <em>Name</em>}</li>
 *   <li>{@link competition.Competition#getCode <em>Code</em>}</li>
 *   <li>{@link competition.Competition#getPlan <em>Plan</em>}</li>
 *   <li>{@link competition.Competition#getCurrentSeason <em>Current Season</em>}</li>
 *   <li>{@link competition.Competition#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link competition.Competition#getTeams <em>Teams</em>}</li>
 *   <li>{@link competition.Competition#getArea <em>Area</em>}</li>
 * </ul>
 *
 * @see competition.CompetitionPackage#getCompetition()
 * @model
 * @generated
 */
public interface Competition extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see competition.CompetitionPackage#getCompetition_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link competition.Competition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see competition.CompetitionPackage#getCompetition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link competition.Competition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see competition.CompetitionPackage#getCompetition_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link competition.Competition#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' attribute.
	 * @see #setPlan(String)
	 * @see competition.CompetitionPackage#getCompetition_Plan()
	 * @model
	 * @generated
	 */
	String getPlan();

	/**
	 * Sets the value of the '{@link competition.Competition#getPlan <em>Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' attribute.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(String value);

	/**
	 * Returns the value of the '<em><b>Current Season</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link competition.Season#getCompetition <em>Competition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Season</em>' containment reference.
	 * @see #setCurrentSeason(Season)
	 * @see competition.CompetitionPackage#getCompetition_CurrentSeason()
	 * @see competition.Season#getCompetition
	 * @model opposite="competition" containment="true"
	 * @generated
	 */
	Season getCurrentSeason();

	/**
	 * Sets the value of the '{@link competition.Competition#getCurrentSeason <em>Current Season</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Season</em>' containment reference.
	 * @see #getCurrentSeason()
	 * @generated
	 */
	void setCurrentSeason(Season value);

	/**
	 * Returns the value of the '<em><b>Last Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Updated</em>' attribute.
	 * @see #setLastUpdated(Date)
	 * @see competition.CompetitionPackage#getCompetition_LastUpdated()
	 * @model
	 * @generated
	 */
	Date getLastUpdated();

	/**
	 * Sets the value of the '{@link competition.Competition#getLastUpdated <em>Last Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated</em>' attribute.
	 * @see #getLastUpdated()
	 * @generated
	 */
	void setLastUpdated(Date value);

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
	 * The list contents are of type {@link competition.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference list.
	 * @see competition.CompetitionPackage#getCompetition_Teams()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * Returns the value of the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' attribute.
	 * @see #setArea(String)
	 * @see competition.CompetitionPackage#getCompetition_Area()
	 * @model
	 * @generated
	 */
	String getArea();

	/**
	 * Sets the value of the '{@link competition.Competition#getArea <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' attribute.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(String value);

} // Competition
