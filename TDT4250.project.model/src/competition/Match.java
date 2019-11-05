/**
 */
package competition;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link competition.Match#getId <em>Id</em>}</li>
 *   <li>{@link competition.Match#getUtcDate <em>Utc Date</em>}</li>
 *   <li>{@link competition.Match#getStatus <em>Status</em>}</li>
 *   <li>{@link competition.Match#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link competition.Match#getScore <em>Score</em>}</li>
 *   <li>{@link competition.Match#getHomeTeam <em>Home Team</em>}</li>
 *   <li>{@link competition.Match#getAwayTeam <em>Away Team</em>}</li>
 * </ul>
 *
 * @see competition.CompetitionPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see competition.CompetitionPackage#getMatch_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link competition.Match#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Utc Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utc Date</em>' attribute.
	 * @see #setUtcDate(Date)
	 * @see competition.CompetitionPackage#getMatch_UtcDate()
	 * @model required="true"
	 * @generated
	 */
	Date getUtcDate();

	/**
	 * Sets the value of the '{@link competition.Match#getUtcDate <em>Utc Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utc Date</em>' attribute.
	 * @see #getUtcDate()
	 * @generated
	 */
	void setUtcDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link competition.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see competition.Status
	 * @see #setStatus(Status)
	 * @see competition.CompetitionPackage#getMatch_Status()
	 * @model required="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link competition.Match#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see competition.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Last Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Updated</em>' attribute.
	 * @see #setLastUpdated(Date)
	 * @see competition.CompetitionPackage#getMatch_LastUpdated()
	 * @model
	 * @generated
	 */
	Date getLastUpdated();

	/**
	 * Sets the value of the '{@link competition.Match#getLastUpdated <em>Last Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated</em>' attribute.
	 * @see #getLastUpdated()
	 * @generated
	 */
	void setLastUpdated(Date value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link competition.Score#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' containment reference.
	 * @see #setScore(Score)
	 * @see competition.CompetitionPackage#getMatch_Score()
	 * @see competition.Score#getMatch
	 * @model opposite="match" containment="true"
	 * @generated
	 */
	Score getScore();

	/**
	 * Sets the value of the '{@link competition.Match#getScore <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' containment reference.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Score value);

	/**
	 * Returns the value of the '<em><b>Home Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Team</em>' reference.
	 * @see #setHomeTeam(Team)
	 * @see competition.CompetitionPackage#getMatch_HomeTeam()
	 * @model required="true"
	 * @generated
	 */
	Team getHomeTeam();

	/**
	 * Sets the value of the '{@link competition.Match#getHomeTeam <em>Home Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Team</em>' reference.
	 * @see #getHomeTeam()
	 * @generated
	 */
	void setHomeTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Away Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away Team</em>' reference.
	 * @see #setAwayTeam(Team)
	 * @see competition.CompetitionPackage#getMatch_AwayTeam()
	 * @model required="true"
	 * @generated
	 */
	Team getAwayTeam();

	/**
	 * Sets the value of the '{@link competition.Match#getAwayTeam <em>Away Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Team</em>' reference.
	 * @see #getAwayTeam()
	 * @generated
	 */
	void setAwayTeam(Team value);

} // Match
