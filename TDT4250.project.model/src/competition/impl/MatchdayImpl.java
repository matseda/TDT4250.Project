/**
 */
package competition.impl;

import competition.CompetitionPackage;
import competition.Match;
import competition.Matchday;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matchday</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link competition.impl.MatchdayImpl#getMatchday <em>Matchday</em>}</li>
 *   <li>{@link competition.impl.MatchdayImpl#getMatches <em>Matches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchdayImpl extends MinimalEObjectImpl.Container implements Matchday {
	/**
	 * The default value of the '{@link #getMatchday() <em>Matchday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchday()
	 * @generated
	 * @ordered
	 */
	protected static final int MATCHDAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMatchday() <em>Matchday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchday()
	 * @generated
	 * @ordered
	 */
	protected int matchday = MATCHDAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchdayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompetitionPackage.Literals.MATCHDAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMatchday() {
		return matchday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchday(int newMatchday) {
		int oldMatchday = matchday;
		matchday = newMatchday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCHDAY__MATCHDAY, oldMatchday, matchday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Match> getMatches() {
		if (matches == null) {
			matches = new EObjectContainmentEList<Match>(Match.class, this, CompetitionPackage.MATCHDAY__MATCHES);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompetitionPackage.MATCHDAY__MATCHES:
				return ((InternalEList<?>)getMatches()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompetitionPackage.MATCHDAY__MATCHDAY:
				return getMatchday();
			case CompetitionPackage.MATCHDAY__MATCHES:
				return getMatches();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CompetitionPackage.MATCHDAY__MATCHDAY:
				setMatchday((Integer)newValue);
				return;
			case CompetitionPackage.MATCHDAY__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends Match>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CompetitionPackage.MATCHDAY__MATCHDAY:
				setMatchday(MATCHDAY_EDEFAULT);
				return;
			case CompetitionPackage.MATCHDAY__MATCHES:
				getMatches().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CompetitionPackage.MATCHDAY__MATCHDAY:
				return matchday != MATCHDAY_EDEFAULT;
			case CompetitionPackage.MATCHDAY__MATCHES:
				return matches != null && !matches.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (matchday: ");
		result.append(matchday);
		result.append(')');
		return result.toString();
	}

} //MatchdayImpl
