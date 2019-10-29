/**
 */
package Competition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Competition.Goal#getMinute <em>Minute</em>}</li>
 *   <li>{@link Competition.Goal#getExtraTime <em>Extra Time</em>}</li>
 *   <li>{@link Competition.Goal#getTeam <em>Team</em>}</li>
 *   <li>{@link Competition.Goal#getScorer <em>Scorer</em>}</li>
 *   <li>{@link Competition.Goal#getAssist <em>Assist</em>}</li>
 *   <li>{@link Competition.Goal#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see Competition.CompetitionPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends EObject {
	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(int)
	 * @see Competition.CompetitionPackage#getGoal_Minute()
	 * @model required="true"
	 * @generated
	 */
	int getMinute();

	/**
	 * Sets the value of the '{@link Competition.Goal#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(int value);

	/**
	 * Returns the value of the '<em><b>Extra Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Time</em>' attribute.
	 * @see #setExtraTime(int)
	 * @see Competition.CompetitionPackage#getGoal_ExtraTime()
	 * @model
	 * @generated
	 */
	int getExtraTime();

	/**
	 * Sets the value of the '{@link Competition.Goal#getExtraTime <em>Extra Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Time</em>' attribute.
	 * @see #getExtraTime()
	 * @generated
	 */
	void setExtraTime(int value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' attribute.
	 * @see #setTeam(String)
	 * @see Competition.CompetitionPackage#getGoal_Team()
	 * @model required="true"
	 * @generated
	 */
	String getTeam();

	/**
	 * Sets the value of the '{@link Competition.Goal#getTeam <em>Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' attribute.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(String value);

	/**
	 * Returns the value of the '<em><b>Scorer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scorer</em>' attribute.
	 * @see #setScorer(String)
	 * @see Competition.CompetitionPackage#getGoal_Scorer()
	 * @model required="true"
	 * @generated
	 */
	String getScorer();

	/**
	 * Sets the value of the '{@link Competition.Goal#getScorer <em>Scorer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scorer</em>' attribute.
	 * @see #getScorer()
	 * @generated
	 */
	void setScorer(String value);

	/**
	 * Returns the value of the '<em><b>Assist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assist</em>' attribute.
	 * @see #setAssist(String)
	 * @see Competition.CompetitionPackage#getGoal_Assist()
	 * @model
	 * @generated
	 */
	String getAssist();

	/**
	 * Sets the value of the '{@link Competition.Goal#getAssist <em>Assist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assist</em>' attribute.
	 * @see #getAssist()
	 * @generated
	 */
	void setAssist(String value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Competition.Match#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' container reference.
	 * @see #setMatch(Match)
	 * @see Competition.CompetitionPackage#getGoal_Match()
	 * @see Competition.Match#getGoals
	 * @model opposite="goals" transient="false"
	 * @generated
	 */
	Match getMatch();

	/**
	 * Sets the value of the '{@link Competition.Goal#getMatch <em>Match</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' container reference.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(Match value);

} // Goal
