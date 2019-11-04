/**
 */
package competition.impl;

import competition.CompetitionPackage;
import competition.Match;
import competition.Score;
import competition.Winner;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Score</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link competition.impl.ScoreImpl#getWinner <em>Winner</em>}</li>
 *   <li>{@link competition.impl.ScoreImpl#getHomeTeam <em>Home Team</em>}</li>
 *   <li>{@link competition.impl.ScoreImpl#getAwayTeam <em>Away Team</em>}</li>
 *   <li>{@link competition.impl.ScoreImpl#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScoreImpl extends MinimalEObjectImpl.Container implements Score {
	/**
	 * The default value of the '{@link #getWinner() <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected static final Winner WINNER_EDEFAULT = Winner.HOME_TEAM;

	/**
	 * The cached value of the '{@link #getWinner() <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected Winner winner = WINNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHomeTeam() <em>Home Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeTeam()
	 * @generated
	 * @ordered
	 */
	protected static final int HOME_TEAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHomeTeam() <em>Home Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeTeam()
	 * @generated
	 * @ordered
	 */
	protected int homeTeam = HOME_TEAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAwayTeam() <em>Away Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayTeam()
	 * @generated
	 * @ordered
	 */
	protected static final int AWAY_TEAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAwayTeam() <em>Away Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayTeam()
	 * @generated
	 * @ordered
	 */
	protected int awayTeam = AWAY_TEAM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompetitionPackage.Literals.SCORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Winner getWinner() {
		return winner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWinner(Winner newWinner) {
		Winner oldWinner = winner;
		winner = newWinner == null ? WINNER_EDEFAULT : newWinner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.SCORE__WINNER, oldWinner, winner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHomeTeam() {
		return homeTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHomeTeam(int newHomeTeam) {
		int oldHomeTeam = homeTeam;
		homeTeam = newHomeTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.SCORE__HOME_TEAM, oldHomeTeam, homeTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAwayTeam() {
		return awayTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAwayTeam(int newAwayTeam) {
		int oldAwayTeam = awayTeam;
		awayTeam = newAwayTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.SCORE__AWAY_TEAM, oldAwayTeam, awayTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Match getMatch() {
		if (eContainerFeatureID() != CompetitionPackage.SCORE__MATCH) return null;
		return (Match)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatch(Match newMatch, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMatch, CompetitionPackage.SCORE__MATCH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatch(Match newMatch) {
		if (newMatch != eInternalContainer() || (eContainerFeatureID() != CompetitionPackage.SCORE__MATCH && newMatch != null)) {
			if (EcoreUtil.isAncestor(this, newMatch))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMatch != null)
				msgs = ((InternalEObject)newMatch).eInverseAdd(this, CompetitionPackage.MATCH__SCORE, Match.class, msgs);
			msgs = basicSetMatch(newMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.SCORE__MATCH, newMatch, newMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompetitionPackage.SCORE__MATCH:
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
			case CompetitionPackage.SCORE__MATCH:
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
			case CompetitionPackage.SCORE__MATCH:
				return eInternalContainer().eInverseRemove(this, CompetitionPackage.MATCH__SCORE, Match.class, msgs);
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
			case CompetitionPackage.SCORE__WINNER:
				return getWinner();
			case CompetitionPackage.SCORE__HOME_TEAM:
				return getHomeTeam();
			case CompetitionPackage.SCORE__AWAY_TEAM:
				return getAwayTeam();
			case CompetitionPackage.SCORE__MATCH:
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
			case CompetitionPackage.SCORE__WINNER:
				setWinner((Winner)newValue);
				return;
			case CompetitionPackage.SCORE__HOME_TEAM:
				setHomeTeam((Integer)newValue);
				return;
			case CompetitionPackage.SCORE__AWAY_TEAM:
				setAwayTeam((Integer)newValue);
				return;
			case CompetitionPackage.SCORE__MATCH:
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
			case CompetitionPackage.SCORE__WINNER:
				setWinner(WINNER_EDEFAULT);
				return;
			case CompetitionPackage.SCORE__HOME_TEAM:
				setHomeTeam(HOME_TEAM_EDEFAULT);
				return;
			case CompetitionPackage.SCORE__AWAY_TEAM:
				setAwayTeam(AWAY_TEAM_EDEFAULT);
				return;
			case CompetitionPackage.SCORE__MATCH:
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
			case CompetitionPackage.SCORE__WINNER:
				return winner != WINNER_EDEFAULT;
			case CompetitionPackage.SCORE__HOME_TEAM:
				return homeTeam != HOME_TEAM_EDEFAULT;
			case CompetitionPackage.SCORE__AWAY_TEAM:
				return awayTeam != AWAY_TEAM_EDEFAULT;
			case CompetitionPackage.SCORE__MATCH:
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
		result.append(" (winner: ");
		result.append(winner);
		result.append(", homeTeam: ");
		result.append(homeTeam);
		result.append(", awayTeam: ");
		result.append(awayTeam);
		result.append(')');
		return result.toString();
	}

} //ScoreImpl
