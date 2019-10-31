/**
 */
package competition.impl;

import competition.CompetitionPackage;
import competition.Match;
import competition.Person;
import competition.Substitution;
import competition.Team;

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
 *   <li>{@link competition.impl.SubstitutionImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link competition.impl.SubstitutionImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link competition.impl.SubstitutionImpl#getPlayerOut <em>Player Out</em>}</li>
 *   <li>{@link competition.impl.SubstitutionImpl#getPlayerIn <em>Player In</em>}</li>
 *   <li>{@link competition.impl.SubstitutionImpl#getTeam <em>Team</em>}</li>
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
	 * The cached value of the '{@link #getPlayerOut() <em>Player Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerOut()
	 * @generated
	 * @ordered
	 */
	protected Person playerOut;

	/**
	 * The cached value of the '{@link #getPlayerIn() <em>Player In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerIn()
	 * @generated
	 * @ordered
	 */
	protected Person playerIn;

	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected Team team;

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
	public Person getPlayerOut() {
		if (playerOut != null && playerOut.eIsProxy()) {
			InternalEObject oldPlayerOut = (InternalEObject)playerOut;
			playerOut = (Person)eResolveProxy(oldPlayerOut);
			if (playerOut != oldPlayerOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompetitionPackage.SUBSTITUTION__PLAYER_OUT, oldPlayerOut, playerOut));
			}
		}
		return playerOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPlayerOut() {
		return playerOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayerOut(Person newPlayerOut) {
		Person oldPlayerOut = playerOut;
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
	public Person getPlayerIn() {
		if (playerIn != null && playerIn.eIsProxy()) {
			InternalEObject oldPlayerIn = (InternalEObject)playerIn;
			playerIn = (Person)eResolveProxy(oldPlayerIn);
			if (playerIn != oldPlayerIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompetitionPackage.SUBSTITUTION__PLAYER_IN, oldPlayerIn, playerIn));
			}
		}
		return playerIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPlayerIn() {
		return playerIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayerIn(Person newPlayerIn) {
		Person oldPlayerIn = playerIn;
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
	public Team getTeam() {
		if (team != null && team.eIsProxy()) {
			InternalEObject oldTeam = (InternalEObject)team;
			team = (Team)eResolveProxy(oldTeam);
			if (team != oldTeam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompetitionPackage.SUBSTITUTION__TEAM, oldTeam, team));
			}
		}
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetTeam() {
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeam(Team newTeam) {
		Team oldTeam = team;
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
			case CompetitionPackage.SUBSTITUTION__MATCH:
				return getMatch();
			case CompetitionPackage.SUBSTITUTION__PLAYER_OUT:
				if (resolve) return getPlayerOut();
				return basicGetPlayerOut();
			case CompetitionPackage.SUBSTITUTION__PLAYER_IN:
				if (resolve) return getPlayerIn();
				return basicGetPlayerIn();
			case CompetitionPackage.SUBSTITUTION__TEAM:
				if (resolve) return getTeam();
				return basicGetTeam();
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
			case CompetitionPackage.SUBSTITUTION__MATCH:
				setMatch((Match)newValue);
				return;
			case CompetitionPackage.SUBSTITUTION__PLAYER_OUT:
				setPlayerOut((Person)newValue);
				return;
			case CompetitionPackage.SUBSTITUTION__PLAYER_IN:
				setPlayerIn((Person)newValue);
				return;
			case CompetitionPackage.SUBSTITUTION__TEAM:
				setTeam((Team)newValue);
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
			case CompetitionPackage.SUBSTITUTION__MATCH:
				setMatch((Match)null);
				return;
			case CompetitionPackage.SUBSTITUTION__PLAYER_OUT:
				setPlayerOut((Person)null);
				return;
			case CompetitionPackage.SUBSTITUTION__PLAYER_IN:
				setPlayerIn((Person)null);
				return;
			case CompetitionPackage.SUBSTITUTION__TEAM:
				setTeam((Team)null);
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
			case CompetitionPackage.SUBSTITUTION__MATCH:
				return getMatch() != null;
			case CompetitionPackage.SUBSTITUTION__PLAYER_OUT:
				return playerOut != null;
			case CompetitionPackage.SUBSTITUTION__PLAYER_IN:
				return playerIn != null;
			case CompetitionPackage.SUBSTITUTION__TEAM:
				return team != null;
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
		result.append(')');
		return result.toString();
	}

} //SubstitutionImpl
