/**
 */
package competition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link competition.Standing#getPositions <em>Positions</em>}</li>
 * </ul>
 *
 * @see competition.CompetitionPackage#getStanding()
 * @model
 * @generated
 */
public interface Standing extends EObject {
	/**
	 * Returns the value of the '<em><b>Positions</b></em>' containment reference list.
	 * The list contents are of type {@link competition.Positon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positions</em>' containment reference list.
	 * @see competition.CompetitionPackage#getStanding_Positions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Positon> getPositions();

} // Standing
