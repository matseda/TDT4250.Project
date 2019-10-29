/**
 */
package Competition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Competition.Team#getId <em>Id</em>}</li>
 *   <li>{@link Competition.Team#getName <em>Name</em>}</li>
 *   <li>{@link Competition.Team#getShortName <em>Short Name</em>}</li>
 *   <li>{@link Competition.Team#getTla <em>Tla</em>}</li>
 *   <li>{@link Competition.Team#getFounded <em>Founded</em>}</li>
 *   <li>{@link Competition.Team#getClubColors <em>Club Colors</em>}</li>
 *   <li>{@link Competition.Team#getSquad <em>Squad</em>}</li>
 * </ul>
 *
 * @see Competition.CompetitionPackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Competition.CompetitionPackage#getTeam_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Competition.Team#getId <em>Id</em>}' attribute.
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
	 * @see Competition.CompetitionPackage#getTeam_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Competition.Team#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see Competition.CompetitionPackage#getTeam_ShortName()
	 * @model
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link Competition.Team#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Tla</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tla</em>' attribute.
	 * @see #setTla(String)
	 * @see Competition.CompetitionPackage#getTeam_Tla()
	 * @model
	 * @generated
	 */
	String getTla();

	/**
	 * Sets the value of the '{@link Competition.Team#getTla <em>Tla</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tla</em>' attribute.
	 * @see #getTla()
	 * @generated
	 */
	void setTla(String value);

	/**
	 * Returns the value of the '<em><b>Founded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Founded</em>' attribute.
	 * @see #setFounded(int)
	 * @see Competition.CompetitionPackage#getTeam_Founded()
	 * @model required="true"
	 * @generated
	 */
	int getFounded();

	/**
	 * Sets the value of the '{@link Competition.Team#getFounded <em>Founded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Founded</em>' attribute.
	 * @see #getFounded()
	 * @generated
	 */
	void setFounded(int value);

	/**
	 * Returns the value of the '<em><b>Club Colors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Club Colors</em>' attribute.
	 * @see #setClubColors(String)
	 * @see Competition.CompetitionPackage#getTeam_ClubColors()
	 * @model
	 * @generated
	 */
	String getClubColors();

	/**
	 * Sets the value of the '{@link Competition.Team#getClubColors <em>Club Colors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Club Colors</em>' attribute.
	 * @see #getClubColors()
	 * @generated
	 */
	void setClubColors(String value);

	/**
	 * Returns the value of the '<em><b>Squad</b></em>' containment reference list.
	 * The list contents are of type {@link Competition.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Squad</em>' containment reference list.
	 * @see Competition.CompetitionPackage#getTeam_Squad()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getSquad();

} // Team
