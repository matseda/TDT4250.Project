/**
 */
package Competition.impl;

import Competition.CompetitionPackage;
import Competition.Match;
import Competition.Substitution;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Competition.impl.SubstitutionImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link Competition.impl.SubstitutionImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link Competition.impl.SubstitutionImpl#getPlayerOut <em>Player Out</em>}</li>
 *   <li>{@link Competition.impl.SubstitutionImpl#getPlayerIn <em>Player In</em>}</li>
 *   <li>{@link Competition.impl.SubstitutionImpl#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstitutionImpl extends MinimalEObjectImpl.Container implements Substitution {
	/**
	 * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected int minute = MINUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeam() <em>Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected static final String TEAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected String team = TEAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayerOut() <em>Player Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerOut()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAYER_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlayerOut() <em>Player Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerOut()
	 * @generated
	 * @ordered
	 */
	protected String playerOut = PLAYER_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayerIn() <em>Player In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerIn()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAYER_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlayerIn() <em>Player In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerIn()
	 * @generated
	 * @ordered
	 */
	protected String playerIn = PLAYER_IN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompetitionPackage.Literals.SUBSTITUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinute(int newMinute) {
		int oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.SUBSTITUTION__MINUTE, oldMinute, minute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTeam() {
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeam(String newTeam) {
		String oldTeam = team;
		team = newTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.SUBSTITUTION__TEAM, oldTeam, team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlayerOut() {
		return playerOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayerOut(String newPlayerOut) {
		String oldPlayerOut = playerOut;
		playerOut = newPlayerOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.SUBSTITUTION__PLAYER_OUT, oldPlayerOut, playerOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlayerIn() {
		return playerIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayerIn(String newPlayerIn) {
		String oldPlayerIn = playerIn;
		playerIn = newPlayerIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.SUBSTITUTION__PLAYER_IN, oldPlayerIn, playerIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Match getMatch() {
		if (eContainerFeatureID() != CompetitionPackage.SUBSTITUTION__MATCH) return null;
		return (Match)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatch(Match newMatch, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMatch, CompetitionPackage.SUBSTITUTION__MATCH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatch(Match newMatch) {
		if (newMatch != eInternalContainer() || (eContainerFeatureID() != CompetitionPackage.SUBSTITUTION__MATCH && newMatch != null)) {
			if (EcoreUtil.isAncestor(this, newMatch))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMatch != null)
				msgs = ((InternalEObject)newMatch).eInverseAdd(this, CompetitionPackage.MATCH__SUBSTITUTIONS, Match.class, msgs);
			msgs = basicSetMatch(newMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.SUBSTITUTION__MATCH, newMatch, newMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompetitionPackage.SUBSTITUTION__MATCH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMatch((Match)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompetitionPackage.SUBSTITUTION__MATCH:
				return basicSetMatch(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CompetitionPackage.SUBSTITUTION__MATCH:
				return eInternalContainer().eInverseRemove(this, CompetitionPackage.MATCH__SUBSTITUTIONS, Match.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompetitionPackage.SUBSTITUTION__MINUTE:
				return getMinute();
			case CompetitionPackage.SUBSTITUTION__TEAM:
				return getTeam();
			case CompetitionPackage.SUBSTITUTION__PLAYER_OUT:
				return getPlayerOut();
			case CompetitionPackage.SUBSTITUTION__PLAYER_IN:
				return getPlayerIn();
			case CompetitionPackage.SUBSTITUTION__MATCH:
				return getMatch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CompetitionPackage.SUBSTITUTION__MINUTE:
				setMinute((Integer)newValue);
				return;
			case CompetitionPackage.SUBSTITUTION__TEAM:
				setTeam((String)newValue);
				return;
			case CompetitionPackage.SUBSTITUTION__PLAYER_OUT:
				setPlayerOut((String)newValue);
				return;
			case CompetitionPackage.SUBSTITUTION__PLAYER_IN:
				setPlayerIn((String)newValue);
				return;
			case CompetitionPackage.SUBSTITUTION__MATCH:
				setMatch((Match)newValue);
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
			case CompetitionPackage.SUBSTITUTION__MINUTE:
				setMinute(MINUTE_EDEFAULT);
				return;
			case CompetitionPackage.SUBSTITUTION__TEAM:
				setTeam(TEAM_EDEFAULT);
				return;
			case CompetitionPackage.SUBSTITUTION__PLAYER_OUT:
				setPlayerOut(PLAYER_OUT_EDEFAULT);
				return;
			case CompetitionPackage.SUBSTITUTION__PLAYER_IN:
				setPlayerIn(PLAYER_IN_EDEFAULT);
				return;
			case CompetitionPackage.SUBSTITUTION__MATCH:
				setMatch((Match)null);
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
			case CompetitionPackage.SUBSTITUTION__MINUTE:
				return minute != MINUTE_EDEFAULT;
			case CompetitionPackage.SUBSTITUTION__TEAM:
				return TEAM_EDEFAULT == null ? team != null : !TEAM_EDEFAULT.equals(team);
			case CompetitionPackage.SUBSTITUTION__PLAYER_OUT:
				return PLAYER_OUT_EDEFAULT == null ? playerOut != null : !PLAYER_OUT_EDEFAULT.equals(playerOut);
			case CompetitionPackage.SUBSTITUTION__PLAYER_IN:
				return PLAYER_IN_EDEFAULT == null ? playerIn != null : !PLAYER_IN_EDEFAULT.equals(playerIn);
			case CompetitionPackage.SUBSTITUTION__MATCH:
				return getMatch() != null;
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
		result.append(" (minute: ");
		result.append(minute);
		result.append(", team: ");
		result.append(team);
		result.append(", playerOut: ");
		result.append(playerOut);
		result.append(", playerIn: ");
		result.append(playerIn);
		result.append(')');
		return result.toString();
	}

} //SubstitutionImpl
