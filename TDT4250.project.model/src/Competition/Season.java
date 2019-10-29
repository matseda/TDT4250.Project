/**
 */
package Competition;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Competition.Season#getId <em>Id</em>}</li>
 *   <li>{@link Competition.Season#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link Competition.Season#getEndDate <em>End Date</em>}</li>
 *   <li>{@link Competition.Season#getCurrentMatchday <em>Current Matchday</em>}</li>
 *   <li>{@link Competition.Season#getMatches <em>Matches</em>}</li>
 *   <li>{@link Competition.Season#getCompetition <em>Competition</em>}</li>
 * </ul>
 *
 * @see Competition.CompetitionPackage#getSeason()
 * @model
 * @generated
 */
public interface Season extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Competition.CompetitionPackage#getSeason_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Competition.Season#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see Competition.CompetitionPackage#getSeason_StartDate()
	 * @model required="true"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link Competition.Season#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see Competition.CompetitionPackage#getSeason_EndDate()
	 * @model required="true"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link Competition.Season#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Current Matchday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Matchday</em>' attribute.
	 * @see #setCurrentMatchday(int)
	 * @see Competition.CompetitionPackage#getSeason_CurrentMatchday()
	 * @model
	 * @generated
	 */
	int getCurrentMatchday();

	/**
	 * Sets the value of the '{@link Competition.Season#getCurrentMatchday <em>Current Matchday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Matchday</em>' attribute.
	 * @see #getCurrentMatchday()
	 * @generated
	 */
	void setCurrentMatchday(int value);

	/**
	 * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
	 * The list contents are of type {@link Competition.Match}.
	 * It is bidirectional and its opposite is '{@link Competition.Match#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' containment reference list.
	 * @see Competition.CompetitionPackage#getSeason_Matches()
	 * @see Competition.Match#getSeason
	 * @model opposite="season" containment="true"
	 * @generated
	 */
	EList<Match> getMatches();

	/**
	 * Returns the value of the '<em><b>Competition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Competition.Competition#getCurrentSeason <em>Current Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Competition</em>' container reference.
	 * @see #setCompetition(Competition)
	 * @see Competition.CompetitionPackage#getSeason_Competition()
	 * @see Competition.Competition#getCurrentSeason
	 * @model opposite="currentSeason" transient="false"
	 * @generated
	 */
	Competition getCompetition();

	/**
	 * Sets the value of the '{@link Competition.Season#getCompetition <em>Competition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Competition</em>' container reference.
	 * @see #getCompetition()
	 * @generated
	 */
	void setCompetition(Competition value);

} // Season
